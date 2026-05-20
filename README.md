# Custom ArrayList in Java

A custom implementation of a dynamic generic list similar to Java's ArrayList.

This project was built to understand how dynamic arrays work internally without using Java Collections.

---

## Features

- Generic type support
- Dynamic resizing
- Add elements
- Remove elements
- Search elements
- Get element by index
- Check list size

---

## Concepts Practiced

- Arrays
- Generics
- Dynamic memory resizing
- Shifting elements
- Loop boundaries
- Custom data structures
- Index management

---

## Methods Implemented

### add(Type value)

Adds a new element to the list.

```java
myList.add("hello");
```

---

### remove(Type value)

Removes the first occurrence of an element.

```java
myList.remove("hello");
```

---

### contains(Type value)

Checks whether an element exists.

```java
myList.contains("hello");
```

Returns:
- `true`
- `false`

---

### value(int index)

Returns the value at a given index.

```java
myList.value(0);
```

---

### size()

Returns current number of elements.

```java
myList.size();
```

---

## How Dynamic Resizing Works

Initial array size:

```text
10
```

When full, array grows by:

```text
currentSize + currentSize / 2
```

Example:

```text
10 -> 15 -> 22 -> 33
```

---

## Example

```java
MylList<String> myList = new MylList<>();

myList.add("hello");

System.out.println(myList.contains("hello"));

myList.remove("hello");

System.out.println(myList.contains("hello"));
```

---

## What I Learned

- Difference between capacity and actual size
- How ArrayList works internally
- Why shifting elements is necessary
- Handling indexes carefully
- Common off-by-one mistakes
- Generic programming basics

---

## Future Improvements

- add(index, value)
- clear()
- isEmpty()
- automatic shrinking
- iterator support
- better exception handling

---

## Author

Built for learning Data Structures and Java fundamentals.
