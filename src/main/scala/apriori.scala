import java.io._
import scala.collection.mutable.ArrayBuffer
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

// Assumption: The format of RAW data is [transaction, item1, item2, ..., itemk]
object Apriori(inputFile : File) {

  // Arguments:
    // 0: Number of sdies to be used. Thus, there will be (number of sides)*(number of sides) mappers and reducers.
    // 1: Input file containing our itemset data.
    // 2: Number of itemsets to calculate. Note that this value depends on the value of [5] - if we are already on itemset 3, and we are
    //      calculating an itemset of 4, the value for this parameter ([2]) will be 1.
    // 3: Support for the itemset calculation
    // 4: Output file this program will write to. Each line of output will have the format "{item1, item2, ..., itemk}: support"
    // 5: 0 if we are looking at raw data, 1 if we are already looking at itemsets.

  def main(args: Array[String]) {

    val t0 = System.nanoTime()

    // Create Spark context with Spark configuration
    val sc = new SparkContext(new SparkConf().setAppName("Apriori"))

    val numSides = args(0).toInt
    val numMappersReducers = numSides*numSides
    val inputRDD = sc.textFile(args(1), numMappersReducers)
    val numItemsets = args(2).toInt
    val minSupport = args(3).toInt
    val printer = new PrintWriter(new File(args(4)))

    val rand = new scala.util.Random

    // Split the input file by line and store each line as an element of the RDD
    val inputLines = inputRDD.flatMap(x => x.split("\n"))

    // If we are looking at raw data, just output the count at each row
    if(args(5).toInt == 0) {













      numItemsets = numItemsets - 1;
    }

    while(numItemsets > 0) {












    }



    val t1 = System.nanoTime()

    System.out.println("Elapsed time: " + (t1 - t0) + "ns")

  }
}