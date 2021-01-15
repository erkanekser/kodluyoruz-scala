package dev.akif.kodluyoruz.streetfinder
package dev.akif.kodluyoruz.CsvLoader

/**
 * See CSV file at: https://github.com/makiftutuncu/kodluyoruz-scala/blob/main/data/streets.csv
 *
 * Original data: https://github.com/life/il-ilce-mahalle-sokak-cadde-sql
 */
object Application {
  def main(args: Array[String]): Unit = {
    val input=Set("ahmet","atatürk").map(_.toUpperCase)
    val streets = loadCsv("data/streets.csv")
    findStreets(streets,input).foreach(println)
  }
}
