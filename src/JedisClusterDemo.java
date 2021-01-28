import redis.clients.jedis.HostAndPort;

import java.util.HashSet;

public class JedisClusterDemo {
    public static void main(String[] args) {
        HashSet<HostAndPort> set = new HashSet<>();
        set.add(new HostAndPort("hadoop001", 6379));
        set.add(new HostAndPort("hadoop002", 6379));
        set.add(new HostAndPort("hadoop003", 6379));
        redis.clients.jedis.JedisCluster jedisCluster = new redis.clients.jedis.JedisCluster(set);
        System.out.println(jedisCluster.ping());

    }
}
