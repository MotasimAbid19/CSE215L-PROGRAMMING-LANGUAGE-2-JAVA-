class parentclass{
    public void display (String str){
        System.out.println("abid "+str);
    }
}
class demo extends parentclass{
    public void display(String str)
    {
        System.out.println("message is "+str);
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.display("Abid noob");
    }
}