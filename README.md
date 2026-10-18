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
└── String/
    └── src/
        ├── AIBasedDocumentSignature.java          # Sum of alphabet positions multiplied by distinct characters
        ├── BankingTransactionReferenceEncoder.java # Adjacent-pair absolute difference encoding
        ├── CybersecurityMessageFingerprint.java    # Overlapping-pair difference/sum fingerprinting
        ├── InventoryLabelTransformation.java       # Inward-pair odd/even difference parity scaling
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
