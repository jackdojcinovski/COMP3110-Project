def summarize(numbers):
    if not numbers:
        return 0, 0, 0
    total = 0
    count = 0
    minimum = numbers[0]
    maximum = numbers[0]
    for n in numbers:
        total += n
        count += 1
        if n < minimum:
            minimum = n
        if n > maximum:
            maximum = n
    avg = total / count
    return total, avg, maximum
