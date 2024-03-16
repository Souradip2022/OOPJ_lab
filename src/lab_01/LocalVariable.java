public class LocalVariable {
  int instanceVar1;
  String instanceVar2 = "Hello";

  static int staticV1;
  static int staticV2;

  LocalVariable(){
    super();
  }
  LocalVariable(int instanceVar1, String instanceVar2){
    super();
    this.instanceVar1 = instanceVar1;
    this.instanceVar2 = instanceVar2;
  }

  public static void main(String[] args) {
    int localV1 = 5;
    String localV2 = "Hello";

    LocalVariable obj = new LocalVariable();
    obj.instanceVar1 = 5;

    LocalVariable.staticV1 = 3;

    System.out.println("Instance variable: " + obj.instanceVar1);
    System.out.println("Static variable: " + staticV1);
    System.out.println("Local variable: " + localV2);
  }
}
