import java.util.Scanner;
private val input = Scanner(System.`in`)

fun jumlah(bilangan2: Array<Int>): Int{
    var jml = 0
    for(bil in bilangan2){
        jml+=bil
    }
    return jml
}
fun jumlah1(vararg bil1: Int):Int{
    var jml1 = 0
    bil1.forEach {bil ->
        jml1 +-bil
    }
    return jml1
}
data class Mahasiswa2(val nama23: String, val umur23: Int)
data class Mahasiswa3(val nama32: String, val umur: Int)
data class Mahasiswa4(val nama9: String, val umur9: Int)
inline fun pangkat(bil1: Int, bil2: Int){
    val hasil = Math.pow(bil1.toDouble(), bil2.toDouble())
    println("Hasil dari $bil1 pangkat $bil2 adalah $hasil")
}
class barang(val nama: String, val harga: Int, val jumlah: Byte, val diskon: Byte){
    fun tampil(){
        println("Nama barang: $nama")
        println("Harga barang: $harga")
        println("Jumlah barang: $jumlah")
        println("Diskon barang: $diskon" + "%")
    }

    fun hitungTotal(){
        val total = harga * jumlah * (100 - diskon) / 100
        println("Total harga barang: $total")
    }
}

fun penjumlahan(bilangan1: Int, bilangan2: Int){
    val hasil23 = bilangan1 + bilangan2
    println("Hasil dari $bilangan1 + $bilangan2 adalah $hasil23")
}

fun pengurangan(bilangan1: Int, bilangan2: Int){
    val hasil24 = bilangan1 - bilangan2
    println("Hasil dari $bilangan1 - $bilangan2 adalah $hasil24")
}

fun perkalian(bilangan1: Int, bilangan2: Int){
    val hasil25 = bilangan1 * bilangan2
    println("Hasil dari $bilangan1 * $bilangan2 adalah $hasil25")
}

fun pembagian(bilangan1: Int, bilangan2: Int){
    val hasil26 = bilangan1 / bilangan2
    println("Hasil dari $bilangan1 / $bilangan2 adalah $hasil26")
}
fun luasPersegi(sisi: Int): Int{
    val luas = sisi * sisi
    return luas
}

fun volumeBalok(panjang: Int, lebar: Int, tinggi: Int): Int{
    val volume = panjang * lebar * tinggi
    return volume
}
fun main(args: Array<String>) {
    println("=====PRAKTIK=====")
    //PRAKTIK
    //no.2 praktik
    var num = 16
    println("Akar $num adalah: ${Math.sqrt(num.toDouble())}")
    val a = 12
    val b = 15
    println("Nilai terbesar dari $a dan $b adalah: "+Math.max(a,b))
    println("4 pangkat 3 = ${Math.pow(4.0, 3.0)}")
    println("==========================================================")
    //no.4 praktik
    val arrBil=arrayOf(10, 20, 30, 50)
    println("Jumlah bilangan: ${jumlah(arrBil)}")
    println("==========================================================")
    //no.5
    println("Jumlah bilangan: ${jumlah1(10,20,30,40)}")
    println("==========================================================")
    //no.6
    println("Jumlah bilangan: ${jumlah1(10,20,30,40,50,60)}")
    println("==========================================================")
    //no.7
    val jumlah2 = {bil2: Int, bil3: Int -> bil2 + bil3}
    println("6+3 = ${jumlah2(5,4)}")
    println("==========================================================")
    //no.8
    val kali = {bil4: Int, bil5: Int, bil6: Int -> bil4*bil5*bil6}
    println("2x2x3 = ${kali(2,2,3)}")
    println("==========================================================")
    //no.9
    val upperCase1: (String) -> String = {str: String -> str.toUpperCase()}
    val upperCase2: (String) -> String = {str -> str.toUpperCase()}
    val upperCase3 = {str: String -> str.toUpperCase()}
    val upperCase4: (String) -> String = {it.toUpperCase()}
    val upperCase5: (String) -> String = String::toUpperCase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase4("hello"))
    println(upperCase5("hello"))
    println("==========================================================")
    //no.10
    func("BeginnersBook", ::demo)
    println("==========================================================")
    //no.11
    val sum = func1(10)
    println("10+20:${sum(20)}")
    println("==========================================================")
    //no.12
    val mhs = Mahasiswa("Susi Susanti",23)
    println("Nama : ${mhs.nama}")
    println("Umur : ${mhs.umur}")
    println("==========================================================")
    //no.13
    val mhs2 = Mahasiswa("Avifta Yulya Rismawa", 16)
    println("Nama : ${mhs2.nama}")
    println("Umur : ${mhs2.umur}")
    println("==========================================================")
    //no.14
    val mhs3 = Mahasiswa()
    println("==========================================================")
    //no.15
    val hsm = Mahasiswa1("Fahri", 17)
    val hsm2 = Mahasiswa1("Avif", 16)
    val hsm3 = Mahasiswa1()
    println("==========================================================")
    //no.16
    val hs = Mahasiswa2("Aku", 7)
    val hs2 = Mahasiswa2("Besar", 8)
    println("Nama Mahasiswa: ${hs.nama23}")
    println("Umur Mahasiswa: ${hs.umur23}")
    println("Nama Mahasiswa: ${hs2.nama23}")
    println("Umur Mahasiswa: ${hs2.umur23}")
    println("==========================================================")
    //no.17
    val mr = Mahasiswa3("Zoro", 14)
    val mr2 = Mahasiswa3("Luffy", 17)
    val mr3 = Mahasiswa3("Usop", 89)
    if(mr.equals(mr2) == true)
        println("mr sama dengan mr2.")
    else
        println("mr tidak sama dengan mr2.")
    if(mr.equals(mr3) == true)
        println("mr sama dengan mr3.")
    else
        println("mr tidak sama dengan mr3.")
    println("Hashcode dari mr: ${mr.hashCode()}")
    println("Hashcode dari mr2: ${mr2.hashCode()}")
    println("Hashcode dari mr3: ${mr3.hashCode()}")
    println("==========================================================")
    //no.18
    val hr = Mahasiswa4("Bara", 18)
    val hr2 = hr.copy(nama9 = "zaki")
    println("Nama ${hr.nama9}, Umur ${hr.umur9}")
    println("Nama ${hr2.nama9}, Umur ${hr2.umur9}")
    println("==========================================================")
    //no.19
    val nama9 = hr.component1()
    val umur9 = hr.component2()
    println("Nama $nama9, Umur $umur9")
    println("==========================================================")
    println("=====LATIHAN=====")
    //LATIHAN
    //no.1
    pangkat(4,4)
    println("==========================================================")
    //no.2
    val barang1 = barang("Buku", 10000, 2, 10)
    barang1.tampil()
    barang1.hitungTotal()
    println("==========================================================")
    println("=====TUGAS=====")
    //TUGAS
    //no.1
    print("Masukkan bilangan pertama: ")
    val bilangan1 = input.nextInt()
    print("Masukkan bilangan kedua: ")
    val bilangan2 = input.nextInt()
    penjumlahan(bilangan1, bilangan2)
    pengurangan(bilangan1, bilangan2)
    perkalian(bilangan1, bilangan2)
    pembagian(bilangan1, bilangan2)
    println("==========================================================")
    //no.2
    println("PILIH MENU")
    println("1. Luas Persegi")
    println("2. Volume Balok")
    print("Masukkan pilihan: ")
    val pilihan = input.nextInt()
    when(pilihan){
        1 -> {
            print("Masukkan sisi: ")
            val sisi = input.nextInt()
            println("Luas persegi adalah ${luasPersegi(sisi)}")
        }
        2 -> {
            print("Masukkan panjang: ")
            val panjang = input.nextInt()
            print("Masukkan lebar: ")
            val lebar = input.nextInt()
            print("Masukkan tinggi: ")
            val tinggi = input.nextInt()
            println("Volume balok adalah ${volumeBalok(panjang, lebar, tinggi)}")
        }
        else -> {
            println("Pilihan tidak ada")
        }
    }
}
fun func(str: String, myfunc: (String) -> Unit){
    print("Welcome to Kotlin tutorial at ")
    myfunc(str)
}
fun demo(str: String){
    println(str)
}
fun func1(num: Int):(Int) -> Int = {num2 -> num2 + num}
class Mahasiswa(val nama: String = "Avif", var umur: Int = 16){
    init{
        println("Nama saya $nama saya berumur $umur tahun")
    }
}
class Mahasiswa1(val nama1: String = "Mahasiswa", val umur1: Int = 99){
    val namaMhs: String
    val umurMhs: Int
    init {
        if (nama1 == "Mahasiswa"){
            namaMhs = "Kosong"
            umurMhs = 0
        }else{
            namaMhs = nama1.toUpperCase()
            umurMhs = umur1
        }
        println("Nama mahasiswa adalah $namaMhs")
        println("Umur mahasiswa adalah $umurMhs")
    }
}