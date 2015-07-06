//def containNeg(nums: List[Int]): Boolean = {
//  var exists = false
//  for (num <- nums)
//    if (num < 0)
//      exists = true
//  exists
//}

//def containOdd(nums: List[Int]): Boolean = {
//  var exists = false
//  for (num <- nums)
//    if (num % 2 == 1)
//      exists = true
//  exists
//}

def containNeg(nums: List[Int]) = nums.exists(_ < 0)

def containOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

containNeg(List(1, 2, 3, 4))
containNeg(List(1, 2, -3, 4))

