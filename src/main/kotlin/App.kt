class App {

    private var jumlahMahasiswa =0
    private var scoreTotalMahasiswa = 0

    fun run (){
    printHeader()
    InputJumlahMahasiswa()
    checkInputJumlahMahasiswa(jumlahMahasiswa)
    calculateScore()
    result()

}

    private fun printHeader (){
    println("===========================")
    println("Aplikasi Penghitung Nilai Rata Rata Mahasiswa")
    println("===========================")
}

    private fun InputJumlahMahasiswa() {
    println("Masukan Jumlah Mahasiswa : ")
    jumlahMahasiswa = try {
        readLine()?.toInt()?: 0
    } catch (e: NumberFormatException) {
        0
    }
}
fun checkInputJumlahMahasiswa(jumlahMahasiswa: Int) {

    if (jumlahMahasiswa <= 0) {
        println("Nilai Tidak Valid Please Re Input ! ")
        InputJumlahMahasiswa()
        checkInputJumlahMahasiswa(this.jumlahMahasiswa)
    }
}
    private fun calculateScore() {
    for (index in 1..jumlahMahasiswa) {
        println("Masukan Nilai Mahasiswa = $index?")
        val score = readLine()?.toInt() ?: 0
        scoreTotalMahasiswa += score
    }
}
    private fun result(){
    println("=============================")
    println("Total Mahasiswa = $jumlahMahasiswa")
    println("Total Nilai Mahasiswa= $scoreTotalMahasiswa   ")
    println("Rata Rata Nilai Mahasiswa = ${scoreTotalMahasiswa/jumlahMahasiswa}  ")
        if (scoreTotalMahasiswa/jumlahMahasiswa > 75) {
            println("pass the Exam")
        }else{
            println("failed the Exam")
        }
    println("=============================")

}

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
           App().run()
        }
    }

}