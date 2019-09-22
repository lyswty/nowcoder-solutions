from queue import PriorityQueue
m = int(input())
heap = PriorityQueue()
for i in range(m):
    s = input()
    heap.put(int(s[-6:]))
while not heap.empty():
    print(heap.get())