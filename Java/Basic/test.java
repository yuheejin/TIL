package Java.Basic;

public class test {

        static String name;
        public test() {}
        public test(String name) {
            this.name = name;
        }
        public static void main(String[] args) {
            test reference = new test();
            reference.checkName();
        }
        public void checkName() {
            test reference1 = new test("Sangmin");
            System.out.println(reference1.name);
            test reference2 = new test("Sungchoon");
            System.out.println(reference1.name);
            System.out.println(reference2.name);
        }

}
