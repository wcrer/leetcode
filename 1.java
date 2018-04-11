class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums1=nums;
        Arrays.sort(nums1);
        for(int i=0;i < nums1.length-1;i++){
            for(int j=i+1; j<nums1.length;j++){
                if(nums1[i]+nums1[j]==target){
                    int[] solution=new int[2];
                    solution[0]=Arrays.asList(nums).indexOf(nums1[i]);
                    solution[1]=Arrays.asList(nums).indexOf(nums1[j]);
                    Arrays.sort(solution);
                    return solution;
                }else if(nums1[i]+nums1[j]>target){
                    break;
                }
            }
        }
        return null;
    }
}