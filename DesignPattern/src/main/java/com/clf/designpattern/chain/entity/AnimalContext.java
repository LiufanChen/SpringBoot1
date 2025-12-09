package com.clf.designpattern.chain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Animal
 * Package: com.clf.springboot1.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:18
 * @Version 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AnimalContext {
    private String name;
    private int age;

}
