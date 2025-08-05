# Enterprise Java Development 1.08

This project contains solutions for four Java programming tasks:

1. BigDecimal operations
2. Car inventory system
3. Video streaming service
4. IntList interface implementations

## Efficiency Comparison: IntArrayList vs IntVector

### IntArrayList
- Increases capacity by 50% when full
- More memory efficient for large lists
- Better for scenarios with tight memory constraints
- Example use case: Mobile applications with limited memory

### IntVector
- Doubles capacity when full
- Fewer resize operations needed
- Better for performance-critical applications
- Example use case: High-performance server applications where add operations need to be as fast as possible

### When to use each:
- Use **IntArrayList** when memory efficiency is more important than minimizing resize operations
- Use **IntVector** when performance of add operations is critical and memory is less constrained
