package demo;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
    public void show(){
        System.out.println("正在调用注解进行开发!");
    }
}
