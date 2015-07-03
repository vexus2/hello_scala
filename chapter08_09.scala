// 再帰の基本形
def approximage(guess: Double): Double =
  if (isGoodEnough(guess)) guess
  else approximage(improve(guess))



def boom(x: Int): Int =
  if (x == 0) throw new Exception("boom!")
  else boom(x - 1) + 1

//boom(3)

def bang(x: Int): Int =
  if (x == 0) throw new Exception("bang!")
  else bang(x - 1)

bang(3)

