package dev.akif.kodluyoruz.streetfinder
import scala.io.Source

trait CsvLoader {
  def loadCsv(string: String): List[String] =
    for (elem <- Source.fromFile(string).getLines.toList) yield elem.split(',')(1)
}

