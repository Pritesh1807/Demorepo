
class Mygit1 {
    Mygit1(String name) {
        System.out.println("constructor with one argument:" + name);
    }

    Mygit1(String name, int num) {
        System.out.println("Constructor with two arguments:" + name + " " + num);
    }

    Mygit1(long id) {
        System.out.println("constructor with long id:" + id);
    }
}

class Mygit {
    public static void main(String[] args) {
        Mygit1 c1 = new Mygit1("pritesh patel");
        Mygit1 c2 = new Mygit1("pritesh", 18);
        Mygit1 c3 = new Mygit1(110089516);
        System.out.println("Hello java");

    }

}