void partition (index low, index high, index& pivotpoint)
{
	index i, j;
	keytype pivotitem;
	pivotitem = S[low]; // pivotitem을 위한 첫번째 항목을 고른다
	j = low;
	for(i = low + 1; i <= high; i++)
		if (S[i] < pivotitem) { // 순서 바뀌었으면, j 증가하고 교환
			j++;
			exchange S[i] and S[j];
		}
	pivotpoint = j;
	exchange S[low] and S[pivotpoint];
	// pivotitem 값을 pivotpoint에 넣는다
}
