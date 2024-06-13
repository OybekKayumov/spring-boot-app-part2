import org.redisson.Redisson;
import org.redisson.api.RKeys;
import org.redisson.api.RScoredSortedSet;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.Date;

import static java.lang.System.out;

public class RedisStorage {

    // Объект для работы с Redis
    private RedissonClient redisson;

    // Объект для работы с ключами
    private RKeys rKeys;

    // Объект для работы с Sorted Set'ом
    private RScoredSortedSet<String> onlineUsers;

    private static String KEY = "ONLINE_USERS";

    private double getTs() {
        return new Date().getTime();
    }

    void init() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        try {
            redisson = Redisson.create();
            rKeys = redisson.getKeys();
            onlineUsers = redisson.getScoredSortedSet(KEY);
            rKeys.delete(KEY);
            registrationUsers();

        } catch (Exception e) {
            out.println("Не удалось подключиться к Redis");
            out.println(e.getMessage());
        }
    }

    public void registrationUsers() {
        for (int i = 0; i < 20; i++) {
            logPageVisit("User " + i);
        }
    }

    void shutdown() {
        redisson.shutdown();
    }

    // Фиксирует посещение пользователем страницы
    void logPageVisit(String name) {
        //ZADD ONLINE_USERS
        onlineUsers.add(getTs(), name);
    }

    void logPageVisit(double rank, String name) {
        //ZADD ONLINE_USERS
        onlineUsers.add(rank, name);
    }

    void deleteUser(String user) {

        onlineUsers.remove(user);
    }

    int calculateUsersNumber() {
        //ZCOUNT ONLINE_USERS
        return onlineUsers.count(Double.NEGATIVE_INFINITY, true,
                Double.POSITIVE_INFINITY, true);
    }

    public RScoredSortedSet<String> getOnlineUsers() {
        return onlineUsers;
    }
}

