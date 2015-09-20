package com.tang

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

import org.apache.spark.mllib.clustering.{LDA, DistributedLDAModel}
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.linalg.{SparseMatrix, DenseMatrix}

/**
 * Created by Tang Lizhe on 2015/9/12.
 * Just for testing some functions.
 */

object Test {
  def main(args: Array[String]): Unit = {
    val s = "(1,(196637,[610,3509,5054,5055,5345,7708,8927,10265,11536,11754,11755,12419,12672,13372,14057,14058,14522,16070,16528,19002,20497,21445,22535,26593,26650,27699,27728,27999,29996,30688,31198,31199,35705,37807,37808,38429,38496,42114,45565,46289,48245,49537,49688,49762,50138,50139,53670,54517,54541,56018,57750,58188,58604,58978,59296,59630,60196,60532,63285,63356,64304,64543,66398,67355,68110,74173,74342,74705,74905,74981,74982,78324,78756,80586,80730,81074,82161,83727,83728,84429,84430,84431,84432,87144,87266,88004,88279,88395,89170,90230,90675,90676,90716,90717,90845,91803,98714,99355,99829,101434,101640,102345,103094,103963,104190,104404,104969,107074,107499,107500,108031,109672,110862,110863,111235,111236,112980,114107,114108,114109,115814,116886,116927,117013,117715,117793,118340,118741,120673,121023,123066,123067,127239,128676,128822,128922,128923,128935,129934,130339,130443,130444,131212,131403,131695,132283,133909,137622,138977,139521,140065,141249,141315,141449,141491,142682,143197,143246,143710,143885,143889,143890,143891,144183,144365,145878,146678,146717,147169,148093,150587,150588,151526,151881,152455,153491,153673,153707,155389,156008,156227,156947,157007,157073,158858,159808,159809,160446,160447,160919,160920,163231,165136,166725,166726,166727,167479,167790,167791,168244,168624,168973,168990,169724,171430,171805,171806,172149,173197,173198,173789,173792,174136,175122,175342,176258,176372,176588,177852,179145,179817,179999,181651,181947,182018,182019,185466,185905,187244,187325,187326,187327,187742,189567,192096,192257,192258,192930,193709,194034,194114,195567,195632,195948],[1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0,1.0,1.0,2.0,3.0,3.0,1.0,1.0,1.0,1.0,1.0,6.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,2.0,1.0,3.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,3.0,1.0,2.0,3.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,2.0,2.0,3.0,2.0,2.0,2.0,2.0,1.0,3.0,2.0,1.0,6.0,1.0,2.0,1.0,1.0,2.0,2.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,2.0,3.0,1.0,1.0,3.0,3.0,3.0,1.0,3.0,3.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,2.0,1.0,5.0,1.0,3.0,1.0,2.0,1.0,1.0,1.0,2.0,3.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,11.0,1.0,1.0,1.0,2.0,3.0,3.0,1.0,2.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,2.0,2.0,2.0,1.0,1.0,1.0,1.0,3.0,3.0,1.0,1.0,2.0,1.0,2.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,8.0,1.0,1.0,3.0,7.0,1.0,1.0,1.0,1.0,1.0,2.0,2.0,1.0,1.0,2.0,2.0,2.0,2.0,1.0,1.0,4.0,1.0,1.0,12.0,1.0,1.0,1.0,1.0,1.0,1.0]))"
    val s2 = "(100,(5,[],[]))"
    val w = s2.trim.split("(\\()|(,\\()|(,\\[)|(\\],\\[)|(\\]\\)\\))")
    for (term <- w)
      println("a " +term)

/*    val docno = w(1).trim.toLong
    val length = w(2).trim.toInt
    val indexArray = w(3).trim.split(",").map(_.toInt)
    val valueArray = w(4).trim.split(",").map(_.toDouble)
    val vector = Vectors.sparse(length, indexArray, valueArray)
    val docWord = docno -> vector

    println(docWord)*/
  }
}
