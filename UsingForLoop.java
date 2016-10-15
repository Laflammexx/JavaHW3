// Giorgi Amirajibi



public class UsingForLoop
{
    public static void main (String[] args)
    {
        int machinePrice = 28000, depreciationRate = 4000, accumulatedDepreciation = 4000;
        int yearCounter;
        System.out.println("\t\t\t\t\tDEPRECIATION SCHEDULE" +
                "\n\t\t---------------------------------------------" +
                "\n  YEAR\t\t Depreciation\t\t  END-OF-YEAR\t\t  ACCUMULATED" +
                "\n" + "\t\t\t\t\t\t\t\t\t VALUE\t\t\t  DEPRECIATION" +
                "\n ------\t\t--------------\t\t---------------\t\t --------------" +
                "\n\t\t\t\t ----\t\t\t\t  ---\t\t\t    --------");
        for (yearCounter = 1; yearCounter <= 7; yearCounter++)
        {
            System.out.println(String.format("%4d",yearCounter) + String.format("\t%13d",depreciationRate) + "\t\t\t" + String.format("\t %5d", machinePrice - depreciationRate) +
                                "\t\t\t\t  " + accumulatedDepreciation);
            machinePrice -= depreciationRate;
            accumulatedDepreciation += depreciationRate;
        }
    }
}
