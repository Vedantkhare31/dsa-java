# 🚀 Java Data Structures & Algorithms (DSA)

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![DSA](https://img.shields.io/badge/Focus-DSA%20Practice-blue.svg)]()
[![Platform](https://img.shields.io/badge/Platform-Competitive%20Programming-brightgreen.svg)]()
[![Status](https://img.shields.io/badge/Status-Active-success.svg)]()

A curated and structured collection of **Data Structures and Algorithms (DSA)** problems, implementations, and solutions written in **Java**. Designed for interview preparation, competitive programming, and mastering foundational algorithmic problem solving.

---

## 📁 Repository Structure

```tree
V:\Java
├── .gitignore
├── README.md
├── Array/
│   └── src/
│       ├── AverageMarks.java        # Sum & Average calculation
│       ├── CountElementsSign.java   # Count Positive, Negative & Zero
│       ├── EvenOdd.java             # Count Even & Odd elements
│       ├── MinMax.java              # Min and Max search without sorting
│       ├── ReverseArray.java        # In-place reversal using two pointers
│       └── SearchElement.java       # Linear search implementation
├── Patterns/
│   ├── ButterflyStarPattern.java          # Butterfly star pattern with symmetric wings
│   ├── DiamondPattern.java                # Diamond star pattern with expanding/contracting rows
│   ├── FloydsTrianglePattern.java         # Floyd's triangle with continuous numbers
│   ├── FramePattern.java                  # Hollow rectangle / frame pattern
│   ├── InvertedNumberTrianglePattern.java # Decreasing number triangle
│   ├── InvertedTrianglePattern.java       # Mirrored triangle with leading spaces
│   ├── NumberPyramidPattern.java          # Centered pyramid of repeating row numbers
│   ├── PalindromicPyramidPattern.java     # Palindromic numeric pyramid with reverse counts
│   ├── RectanglePattern.java              # Solid rectangle pattern
│   ├── ReverseTrianglePattern.java        # Inverted right-angled triangle
│   ├── SolidRhombusPattern.java           # Solid rhombus pattern with leading indentation
│   ├── TrianglePattern.java               # Standard right-angled triangle
│   ├── TriangleWithNumbersPattern.java    # Increasing number triangle
│   └── ZeroOneTrianglePattern.java        # Alternating 0-1 triangle pattern
└── String/
    └── src/
        ├── AIBasedDocumentSignature.java          # Sum of alphabet positions multiplied by distinct characters
        ├── BankingTransactionReferenceEncoder.java # Adjacent-pair absolute difference encoding
        ├── CybersecurityMessageFingerprint.java    # Overlapping-pair difference/sum fingerprinting
        ├── InventoryLabelTransformation.java       # Inward-pair odd/even difference parity scaling
        ├── ResearchPaperMetadataEncoder.java      # Absolute diff between alphabet sum and distinct count squared
        ├── SecureAccessTokenGenerator.java        # Access token generation with paired diffs/sums
        ├── SmartLogisticsRouteEncoder.java        # Inward-pair difference scaled by length with digit-sum reduction
        ├── SmartTextCompression.java              # Smart text compression via symmetric character difference
        └── StudentPerformanceCode.java            # Inward-pair alphabet position sum with 26-wrapping
```

---

## 📌 Problem Index

### 🔢 Arrays

| # | Problem Name | Difficulty | Solution Link | Key Concepts / Approach |
|:---:|:---|:---:|:---:|:---|
| 1 | **Array Sum and Average** | `Easy` | [AverageMarks.java](Array/src/AverageMarks.java) | Iterative summation, floating-point arithmetic |
| 2 | **Count Positive, Negative & Zero** | `Easy` | [CountElementsSign.java](Array/src/CountElementsSign.java) | Frequency counters, conditional evaluation |
| 3 | **Count Even and Odd** | `Easy` | [EvenOdd.java](Array/src/EvenOdd.java) | Modulo arithmetic (`n % 2 == 0`) |
| 4 | **Find Minimum and Maximum** | `Easy` | [MinMax.java](Array/src/MinMax.java) | Array traversal, boundary tracking |
| 5 | **Reverse an Array** | `Easy` | [ReverseArray.java](Array/src/ReverseArray.java) | Two-pointer technique, $O(1)$ auxiliary space |
| 6 | **Linear Search** | `Easy` | [SearchElement.java](Array/src/SearchElement.java) | Linear scanning, early break / index reporting |

### 📐 Pattern Printing

| # | Pattern Name | Difficulty | Solution Link | Key Concepts / Approach |
|:---:|:---|:---:|:---:|:---|
| 1 | **Solid Rectangle Pattern** | `Easy` | [RectanglePattern.java](Patterns/RectanglePattern.java) | Nested rows & columns loop iteration |
| 2 | **Hollow Frame Pattern** | `Easy` | [FramePattern.java](Patterns/FramePattern.java) | Matrix border conditionals (`i == 0 \|\| i == r-1 \|\| j == 0 \|\| j == c-1`) |
| 3 | **Right-Angled Triangle** | `Easy` | [TrianglePattern.java](Patterns/TrianglePattern.java) | Dependent inner loop bounds (`j < i`) |
| 4 | **Inverted Right-Angled Triangle** | `Easy` | [ReverseTrianglePattern.java](Patterns/ReverseTrianglePattern.java) | Decreasing loop iteration (`i = rows; i >= 0; i--`) |
| 5 | **Mirrored Inverted Triangle** | `Easy` | [InvertedTrianglePattern.java](Patterns/InvertedTrianglePattern.java) | Two inner loops: leading space indentation + asterisk printing |
| 6 | **Number Triangle** | `Easy` | [TriangleWithNumbersPattern.java](Patterns/TriangleWithNumbersPattern.java) | 1-based column index printing (`1` to `i`) |
| 7 | **Inverted Number Triangle** | `Easy` | [InvertedNumberTrianglePattern.java](Patterns/InvertedNumberTrianglePattern.java) | Inverted row-bound inner number printing |
| 8 | **Floyd's Triangle** | `Easy` | [FloydsTrianglePattern.java](Patterns/FloydsTrianglePattern.java) | Continuous sequence increment with persistent counter |
| 9 | **0-1 Alternating Triangle** | `Easy` | [ZeroOneTrianglePattern.java](Patterns/ZeroOneTrianglePattern.java) | Coordinate parity check (`(i + j) % 2 == 0`) |
| 10 | **Solid Rhombus** | `Easy` | [SolidRhombusPattern.java](Patterns/SolidRhombusPattern.java) | Leading space offset (`rows - i`) with fixed width asterisks |
| 11 | **Number Pyramid** | `Easy` | [NumberPyramidPattern.java](Patterns/NumberPyramidPattern.java) | Center-aligned pyramid with space-separated row numbers |
| 12 | **Palindromic Number Pyramid** | `Medium` | [PalindromicPyramidPattern.java](Patterns/PalindromicPyramidPattern.java) | Leading spaces + descending sequence (`i` to `1`) + ascending sequence (`2` to `i`) |
| 13 | **Diamond Star Pattern** | `Medium` | [DiamondPattern.java](Patterns/DiamondPattern.java) | Symmetric upper & lower pyramids using odd star counts (`2*i - 1`) |
| 14 | **Butterfly Star Pattern** | `Medium` | [ButterflyStarPattern.java](Patterns/ButterflyStarPattern.java) | Two symmetric star wings with dynamic center gap (`2 * (rows - i)`) |

### 🔤 Strings

| # | Problem Name | Difficulty | Solution Link | Key Concepts / Approach |
|:---:|:---|:---:|:---:|:---|
| 1 | **Smart Text Compression** | `Hard` | [SmartTextCompression.java](String/src/SmartTextCompression.java) | Two-pointer inward character pairing, ASCII offset mapping, absolute differences |
| 2 | **Secure Access Token Generator** | `Hard` | [SecureAccessTokenGenerator.java](String/src/SecureAccessTokenGenerator.java) | Inward pairing with zero-diff sum fallback, middle character scaling |
| 3 | **Banking Transaction Reference Encoder** | `Medium` | [BankingTransactionReferenceEncoder.java](String/src/BankingTransactionReferenceEncoder.java) | Adjacent consecutive character differences, single-character fallback |
| 4 | **Cybersecurity Message Fingerprint** | `Medium` | [CybersecurityMessageFingerprint.java](String/src/CybersecurityMessageFingerprint.java) | Overlapping consecutive pairs, nonzero-diff vs zero-diff sum logic |
| 5 | **Inventory Label Transformation** | `Medium` | [InventoryLabelTransformation.java](String/src/InventoryLabelTransformation.java) | Inward pairing, odd difference doubling, even difference halving, middle char |
| 6 | **Student Performance Code** | `Medium` | [StudentPerformanceCode.java](String/src/StudentPerformanceCode.java) | Inward pairing sum, modulo-like 26 range wrapping, middle char preservation |
| 7 | **AI-Based Document Signature** | `Medium` | [AIBasedDocumentSignature.java](String/src/AIBasedDocumentSignature.java) | Alphabet position summation, distinct character counting, product hashing |
| 8 | **Smart Logistics Route Encoder** | `Hard` | [SmartLogisticsRouteEncoder.java](String/src/SmartLogisticsRouteEncoder.java) | Inward pairing, length scaling, repeated digit-sum reduction ($\le 99$) |
| 9 | **Research Paper Metadata Encoder** | `Medium` | [ResearchPaperMetadataEncoder.java](String/src/ResearchPaperMetadataEncoder.java) | Alphabet sum, unique character count tracking, squared difference hashing |

---

## 🛠️ How to Compile & Run

Make sure you have JDK (Java Development Kit 8 or higher) installed.

### 1. Clone the repository
```bash
git clone https://github.com/Vedantkhare31/dsa-java.git
cd dsa-java
```

### 2. Compile any solution
```bash
# Example: Compiling ReverseArray
javac Array/src/ReverseArray.java
```

### 3. Run the compiled class
```bash
# Example: Running ReverseArray
java -cp Array/src ReverseArray
```

---

## 📈 Roadmap & Ongoing Topics
- [x] Basic Arrays & In-Place Manipulations
- [x] Pattern Printing & Nested Loops
- [x] Basic String Operations & ASCII Encoding
- [ ] 2D Arrays / Matrices
- [ ] Recursion & Backtracking
- [ ] Searching & Sorting Algorithms
- [ ] Linked Lists
- [ ] Stacks & Queues
- [ ] Trees & Binary Search Trees
- [ ] Dynamic Programming & Graphs

---

## 👤 Author

- **Vedant Khare**
- GitHub: [@Vedantkhare31](https://github.com/Vedantkhare31)
- Email: `vedantkhare155@gmail.com`
