import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("hadoop000", 6379);
        // System.out.println(jedis.ping());
        //key
     /*   Set<String> keys = jedis.keys("*");
        for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            System.out.println(key);
        }

        System.out.println("jedis.exists====>"+jedis.exists("ning"));
        System.out.println(jedis.ttl("wen"));*/


        //String
       /* System.out.println(jedis.get("wen"));
        jedis.set("wentao","meiyun");
        jedis.mset("zhang","san","li","si","wang","wu");
        System.out.println(jedis.mget("zhang", "li", "wang"));*/

        //List
      /*  jedis.lpush("huojian","shaonv","weigui","nvhai","bugong","daitian");
        List<String> huojian = jedis.lrange("huojian", 0, -1);
        for (String str :
                huojian) {
            System.out.println(str);

        }*/


        //set
 /*       jedis.sadd("orders","jd001");
        jedis.sadd("orders","jd002");
        jedis.sadd("orders","jd003");
        Set<String> orders = jedis.smembers("orders");
        Iterator<String> iterator = orders.iterator();
        for (;iterator.hasNext();){
            String string = iterator.next();
            System.out.println(string);
        }
        jedis.srem("orders", "jd002");
*/
        //hash
     /*  jedis.hset("wo","name","ning");
        System.out.println(jedis.hget("wo", "name"));
        HashMap<String, String> map = new HashMap<>();
        map.put("tel","18317783838");
        map.put("adderss","sdkfjofj");
        map.put("email","avdd@126.com");
        jedis.hmset("hash2",map);
        List<String> list = jedis.hmget("hash2", "adderss", "email");
        for (String str :
                list) {
            System.out.println(str);

        }*/

        //zset
        jedis.zadd("zset01", 60, "v1");
        jedis.zadd("zset01", 70, "v2");
        jedis.zadd("zset01", 80, "v3");
        jedis.zadd("zset01", 90, "v4");
        Set<String> zset01 = jedis.zrange("zset01", 0, -1);
        Iterator<String> iterator = zset01.iterator();
        for (; iterator.hasNext(); ) {
            String str = iterator.next();
            System.out.println(str);
        }


    }
}
