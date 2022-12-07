public class DP_ArrengeBuildings {
    public static void main(String[] args) {
        long noOfPlots = 5;

        long oldBuildingCount = 1;
        long oldSpaceCount = 1;

        for(int i = 2; i<=noOfPlots; i++){
            long newBuildingCount = oldSpaceCount;
            long newSpaceCount = oldBuildingCount + oldSpaceCount;

            oldBuildingCount = newBuildingCount;
            oldSpaceCount = newSpaceCount;
        }

        long totalPossibilitiesOnSideOne = oldSpaceCount + oldBuildingCount;
        long totalPossibilities = totalPossibilitiesOnSideOne * totalPossibilitiesOnSideOne;
        System.out.println(totalPossibilities);
    }
}
