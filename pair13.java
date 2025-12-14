  if arr[j] > arr[j + 1]:

                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp

def bubble_sort(arr):

    n = len(arr)
    for i in range(n - 1):
        for j in range(0, n - i - 1):
        
