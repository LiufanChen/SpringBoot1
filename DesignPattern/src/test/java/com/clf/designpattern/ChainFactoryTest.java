package com.clf.designpattern;


import com.clf.ChainApplication;
import com.clf.designpattern.chain.Factory.ChainFactory;
import com.clf.designpattern.chain.entity.AnimalContext;
import com.clf.designpattern.chain.entity.FruitContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: test
 * Package: com.clf.springboot1.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 23:39
 * @Version 1.0
 */
@SpringBootTest(classes = ChainApplication.class)
public class ChainFactoryTest {

    @Autowired
    private ChainFactory animalChain;

    @Autowired
    private ChainFactory fruitChain;

    @Test
    public void testAnimalChain() {
        AnimalContext animalContext = new AnimalContext("A", 2);
        animalChain.handle(animalContext);
    }
    @Test
    public void testFruitChain() {
        FruitContext fruitContext = new FruitContext("apple", "q");
        fruitChain.handle(fruitContext);
    }




}
