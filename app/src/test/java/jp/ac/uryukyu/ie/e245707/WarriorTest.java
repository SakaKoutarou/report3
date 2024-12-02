package jp.ac.uryukyu.ie.e245707;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 20);
        Enemy slime = new Enemy("スライムもどき", 100, 4);
        for(int i = 1; i <= 3;i ++){
            int slimeHitPoint = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            slime.attack(demoWarrior); 
            assertEquals(30, slimeHitPoint - slime.getHitPoint()); 
        }
    }
}
