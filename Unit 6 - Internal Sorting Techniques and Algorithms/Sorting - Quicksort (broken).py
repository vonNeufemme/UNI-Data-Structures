# quicksort
sorted_array = []
array = [12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77]

# needs to handle the case where the [left] or [right] is empty. 
# This code is broken, doesn't sort. 
def quicksort(array):

    pivot = 0
    left = []
    right = []

    if (len(array) == 1):
        sorted_array.extend(array)
    
    else: 
        pivot = array.pop()

    for a in array:
        if (a <= pivot):    # if smaller or equal to the pivot,
            left.append(a)  # the item goes to the left side 
            print(f"left[{a}] <= pivot")
        else:
            right.append(a) # if greater, goes to the right side.
            print(f"pivot < right[{a}]")
    
    print(f"{left} - pivot [{pivot}] - {right}\n\n")

    quicksort(left)
    quicksort(right)

    return sorted_array

quicksorted_array = quicksort(array)
print(len(quicksorted_array))
quicksorted_array
