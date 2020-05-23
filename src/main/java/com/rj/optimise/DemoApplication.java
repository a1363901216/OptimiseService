package com.rj.optimise;

import com.rj.optimise.vo.OptimseTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        OptimseTask optimseTask= OptimseTask.builder()
                .requestKey("requestKey1")
                .approvTime(System.currentTimeMillis())
                .downloadingProgress(50)
                .pceInstance("pceInstance")
                .splice(1)
                .startTime(System.currentTimeMillis() - 100)
                .stateEum(OptimseTask.StateEumEnum.PENDING)
                .build();

        System.out.println("1");
    }

}
