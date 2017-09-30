  // クラス 
class Main {          //System.out.println();
  // メソッド
  public static void main(String[] args) {
    // 処理
    System.out.println("Hello World");  // System.out.println 出力 lnのl 小文字のL

    // 5に3を足した値を出力
    System.out.println(5 + 3);
    // int型 i 小文字
    // 「5 + 3」を文字列として出力
    System.out.println("5 + 3");
    // 8を3で割った余りを出力
    System.out.println(8 % 3); 
    //文字列連結
    System.out.println("Hello" + "World"); 

    //変数
    // int型の変数numberを定義
    int number;
    // 変数numberに3を代入
    number = 3;  
    // 変数numberを出力
    System.out.println(number); 

    // String型の変数nameを定義
    String name;   
    // 変数nameに"Wanko"を代入
    name = "Wanko";
    // 変数nameを出力
    System.out.println(name); 

    //変数の値の代入は変数定義と同時に行うことができる。
    //変数定義と同時に値を代入することを変数の初期化と呼ぶ

    int number1 = 3;
    int number2 = 7;
    // number1 * number2を出力
    System.out.println(number1 * number2);    
    // 変数textに「勉強」を代入
    String text = "勉強";    
    // 「Progateで」と変数textを連結して出力
    System.out.println("Progateで" + text);

    //自己代入
    number = 3;
    System.out.println(number);    // 3
    // 変数numberの値に7を足して、変数numberを上書き
    number = number + 7;   
    // 変数numberを出力
    System.out.println(number);    // 10

    //自己代入省略型
    int number3 = 8;
    // 変数numberに7をかけて、変数numberを上書き
    number3 *= 7;

    // 変数numberの値に1を足して、変数numberを上書き
    //１の時はさらに省略できる    
    number3 ++; 
      // number --; １を引く時
    // 変数numberを出力
    System.out.println(number3);

    
  }
}
