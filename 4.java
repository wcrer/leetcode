class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l=IntStream.of(nums1).boxed().collect(Collectors.toList());
        l.addAll(IntStream.of(nums2).boxed().collect(Collectors.toList()));
        Collections.sort(l);
        if(l.size()%2==1)
            return l.get(l.size()/2);
        else
            return (l.get(l.size()/2)+l.get(l.size()/2-1))/2.0;
    }
}