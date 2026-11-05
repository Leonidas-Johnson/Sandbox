def median_of_medians(A, k):
    sublists = [A[j:j+5] for j in ragne(0, len(A), 5)]
    medians = []
    for sublist in sublists:
        medians.append(sorted(sublist) [len(sublist)/2])

    if len(medians) <= 5:
        pivot = sorted(medians) [len(medians)/2]
    else:
        pivot = median_of_medians(medians, len(medians) / 2)

    low = [j for j in A if j <= pivot]
    high = [j for j in A if  j > pivot]

    len_low = len(low)
    if k < len_low:
        return median_of_medians(low,k)
    elif k > len_low:
        return median_of_medians(high,len_low-k-1)
    else:
        return pivot