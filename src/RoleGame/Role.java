package RoleGame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    //        attack 攻击描述:
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //        injured 受伤描述:
    String[] injureeds_desc= {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role()
    {}
    public Role(String name, int blood)
    {
        this.name = name;
        this.blood = blood;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getBlood()
    {
        return blood;
    }
    public void setBlood(int blood)
    {
        this.blood = blood;
    }
    public void attack(Role role)
    {
        Random r=new Random();
        int index=r.nextInt(attacks_desc.length);
        String KungFu=attacks_desc[index];

        System.out.printf(KungFu,this.getName(),role.getName());
        System.out.println();

        int hurt=r.nextInt(20)+1;
        int remainblood=role.getBlood()-hurt;
        remainblood=remainblood < 0 ? 0 : remainblood;
        role.setBlood(remainblood);

        if(remainblood>90)
        {
            System.out.printf(injureeds_desc[0],role.getName());
        }
        else if(remainblood>80)
        {
            System.out.printf(injureeds_desc[1],role.getName());
        }
        else if(remainblood>70)
        {
            System.out.printf(injureeds_desc[2],role.getName());
        }
        else if(remainblood>60)
        {
            System.out.printf(injureeds_desc[3],role.getName());
        }
        else if(remainblood>40)
        {
            System.out.printf(injureeds_desc[4],role.getName());
        }
        else if(remainblood>20)
        {
            System.out.printf(injureeds_desc[5],role.getName());
        }
        else if(remainblood>10)
        {
            System.out.printf(injureeds_desc[6],role.getName());
        }
        else
        {
            System.out.printf(injureeds_desc[7],role.getName());
        }
        System.out.println();
    }

}
