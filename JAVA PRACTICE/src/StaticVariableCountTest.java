public class StaticVariableCountTest{
    public static void main(String[] args) {
        StaticeVariablecount s1 = new StaticeVariablecount();
        s1.StaticVariableCountPrint();
        StaticeVariablecount s2 = new StaticeVariablecount();
        s2.StaticVariableCountPrint();
        StaticeVariablecount s3 = new StaticeVariablecount();
        s3.StaticVariableCountPrint();
        StaticeVariablecount s4 = new StaticeVariablecount();
        s4.StaticVariableCountPrint();
        StaticeVariablecount s5 = new StaticeVariablecount();

        s5.StaticVariableCountPrint();

        //kotobar static call kora hyse oitar count.. static use na korle 
        // protekbar 1 dekhayto.
        // cause new kore memory create hyto
        // static dile ekta memory allocated hoy..
        //ar bar bar oi memory point koree..
        // that's why same variable e static use kora hoy
    }

}