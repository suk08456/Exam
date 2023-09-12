public class Exam3 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다. 청둥오리는 불사조 날개를 가지고 태어납니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다. 붉은오리는 로켓 날개를 가지고 태어납니다.

        a붉은오리.날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다

    }
}
class 오리{
    오리 a오리;
    String name;
    String 날개;


    public static void Person(String name, String 날개){
        System.out.printf("%s가 만들어집니다. %s는 %s를 가지고 태어납니다.", name, name, 날개);
    }
}
class 청둥오리 extends 오리{
    String name = "청둥오리";
    String wing = "기본날개";
    String why = "천천히";


    public static void 날다(){
        System.out.println("청둥오리가 날개로 천천히 날아갑니다.");
    }
}
class 흰오리 extends 오리{


    public void 날다(){
        System.out.println("흰오리가 불사조 날개로 불타오르며 날아갑니다.");
    }
}
class 붉은오리 extends 오리{
    public void 날다(){
        System.out.println("붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다");
    }
}
class 날개{
    void Person(){
        System.out.println();
    }
}


