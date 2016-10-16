//Gio

public class ForWithoutFormat
{
    public static void main(String[] args)
    {
        /** I declared variables and gave them values which we know that they are static
         *  like price of a machine which in year #1 is 28000, depreciation rate is 4000 every year,
         *  accumulated depreciation is 4000 because after first year according to depreciation rate
         *  it would already be 4000 and not 0, yearCounter is a variable for counting how many years
         *  or cycles will make the for loop*/
        int machinePrice = 28000, depreciationRate = 4000, accumulatedDepreciation = 4000, yearCounter;
        /** In a for loop there are 3 different statements: for (statement1; statement2; statement3)
         *  In the first one we should write where the for loop begins. We could tell for loop to start at
         *  yearCounter = 0, but since we need to display yearCounter later for the first result it
         *  would print YEAR = 0 instead of YEAR = 1 therefore we start at yearCounter = 1; Also we could
         *  declare yearCounter inside the for loop as the first statement (statement 1) just writing:
         *  int yearCounter = 1; (One thing that might be little confusing is the variable i in
         *  a for loop. i is a variable which is mostly used in loops by developers but you can use
         *  any desirable variable for your program. We could use i in our loop instead of yearCounter
         *  like this: for (i = 1; i <= 7; i++). This way it would be more clear for other developers
         *  that i is a variable which is used for the loop. In statement 2 we write where our loop
         *  should end. Because we know that our loop should cycle(do itself) for 7 times because we
         *  should calculate our outputs for 7 years, therefore we write yearCounter <= 7 or we could
         *  write yearCounter < 8 (1,2,3,4,5,6,7 = 7 numbers). If we started with yearCounter = 0 then
         *  we would write yearCounter <= 6 or yearCounter < 7. In statement 3 we write yearCounter++
         *  which means that every time for loop will perform cycle it will increase value of
         *  yearCounter by 1. After cycle #1 yearCounter will be 2 then 3 etc. until it will become 8
         *  (after 7 cycles) which will end our loop because yearCounter which is 8 will not satisfy
         *  statement2 which is yearCounter <= 7 and the loop will end.*/
        for (yearCounter = 1; yearCounter <= 7; yearCounter++)
        {
            /** In the for loop we have to display(output) 3 different things. #1:YEAR,
             *  #2: machine price after certain years, #3: Accumulated depreciation.
             *  Starting with #1(YEAR) we can use yearCounter because as year increases by
             *  1 we know that yearCounter also increases by 1, Therefore we print yearCounter.
             *  For #2(machine price) when the compiler enters our for loop it knows that machine price
             *  is 28000 because we declared it, but we want to output machine price after 1 year which
             *  will be 24000(starting price 28000 - depreciation rate 4000) and because we know that
             *  depreciation rate is a constant we assign machinePrice = machinePrice - depreciation rate
             *  which for every loop will subtract 4000 from machinePrice and assign the new value to itself.
             *  Then we just display machinePrice. For #3(Accumulated depreciation) we do same kind of
             *  thing we did for machinePrice. We say that accumulatedDepreciation will be 4000(as declared)
             *  + 4000 = 8000. But here is one important thing about assigning. If you look at the order of the
             *  code below I wrote 1st: machinePrice = machinePrice - depreciationRate, 2nd: I printed all
             *  the stuff I wanted to print and only then I wrote 3rd: accumulatedDepreciation =
             *  accumulatedDepreciation + depreciationRate. Changing places of these 3 lines would change
             *  the output in different ways. If we did System.out.print first then machinePrice then
             *  accumulatedDepreciation we would get YEAR=1, machinePrice = 28000 instead of 24000 and
             *  accumulatedDepreciation same as is now because it has to be below System.out.print.
             *  If we wrote machinePrice first then accumulatedDepreciation and then System.out.print
             *  we would get machinePrice = 24000, accumulatedDepreciation = 8000 instead of 4000.
             *  Therefore it is important to write a code in certain order to get desirable result
             *  because the compiler goes from top to bottom and therefore knows what is declared
             *  above before what is declared or printed below. So if you need to pass certain
             *  values before it is printed out by System.out.print, you have to state that above
             *  print statement and to do things which will be shown after loop enters itself for
             *  the second time you have to declare it after print statement in order not to show it in
             *  output. Any question is acceptable and feel free to ask. I hope blood is not running
             *  out of your eyes because of reading all this and I helped you to clear some confusion
             *  about the for loop. The End.*/
            machinePrice = machinePrice - depreciationRate;
            System.out.println("YEAR = " + yearCounter + ", " + "Machine price for year " + yearCounter +
                               " = " + machinePrice + ", " + "Accumulated depreciation = " +
                               accumulatedDepreciation);
            accumulatedDepreciation = accumulatedDepreciation + depreciationRate;
        }
    }
}
