import java.util.Scanner

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    print("masukkan nilai anda : ")

    //nextInt() reads the integer from the keyboard
    var nilai:Int = reader.nextInt()
    if (nilai >= 98 ){
        print ("nilai kamu $nilai, masuk kategori A")

    }
    else if(nilai >= 80 && nilai <= 90)
    {
        print("nilai kamu $nilai, masuk kategori B")
    }
    else if (nilai >= 70 && nilai <= 80)
    {
        print("nilai kamu $nilai, masuk kategoti c")
    }
    else if (nilai >= 60 && nilai <= 70)
    {
        print("nilai kamu &nilai, masuk kategori d")
    }else{

    }
}