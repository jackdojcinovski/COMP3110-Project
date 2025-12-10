def summarize(numbers):
    if not numbers:
        return {
            "total": 0,
            "avg": 0,
            "min": 0,
            "max": 0,
            "count": 0,
        }

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

    return {
        "total": total,
        "avg": avg,
        "min": minimum,
        "max": maximum,
        "count": count,
    }
