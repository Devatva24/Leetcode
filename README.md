# 💻 LeetCode Solutions in Java   

<div align="center">

![LeetCode Banner](https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=300&section=header&text=LeetCode%20Solutions&fontSize=90&fontColor=fff&animation=fadeIn&fontAlignY=38&desc=Comprehensive%20Java%20Solutions%20for%20Interview%20Preparation&descAlignY=55&descAlign=50)

### A comprehensive collection of LeetCode problem solutions with clean, optimized code

[![GitHub Stars](https://img.shields.io/github/stars/Devatva24/Leetcode?style=for-the-badge&logo=github)](https://github.com/Devatva24/Leetcode/stargazers)
[![Total Problems](https://img.shields.io/badge/Problems%20Solved-200+-success?style=for-the-badge&logo=leetcode)](https://github.com/Devatva24/Leetcode)
[![Language](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)](https://github.com/Devatva24/Leetcode)
[![Commits](https://img.shields.io/github/commit-activity/m/Devatva24/Leetcode?style=for-the-badge&logo=git)](https://github.com/Devatva24/Leetcode/commits/main)
[![Last Updated](https://img.shields.io/github/last-commit/Devatva24/Leetcode?style=for-the-badge&logo=github)](https://github.com/Devatva24/Leetcode/commits/main)

[View Problems](#-problem-categories) · [Report Issue](https://github.com/Devatva24/Leetcode/issues) · [Contribute](#-contributing)

</div>

---

## 📖 Table of Contents

- [About](#-about)
- [Problem Categories](#-problem-categories)
- [Repository Statistics](#-repository-statistics)
- [Repository Structure](#-repository-structure)
- [How to Use](#-how-to-use)
- [Problem Naming Convention](#-problem-naming-convention)
- [Solution Template](#-solution-template)
- [Key Features](#-key-features)
- [Topics Covered](#-topics-covered)
- [Contributing](#-contributing)
- [Connect](#-connect)
- [License](#-license)

---

## 🎯 About

This repository contains my solutions to LeetCode problems, implemented in **Java**. Each solution includes:

- ✅ Clean, readable code with proper naming conventions
- 📝 Detailed comments explaining the approach
- ⚡ Optimized algorithms with time and space complexity analysis
- 🧪 Test cases and edge case handling
- 🎓 Interview preparation friendly explanations

<div align="center">

| Metric | Count |
|:------:|:-----:|
| **Total Problems Solved** | 200+ |
| **Total Commits** | 742+ |
| **Language** | Java 100% |
| **Difficulty Levels** | Easy, Medium, Hard |

</div>

---

## 📊 Problem Categories

<table>
<tr>
<td width="33%">

### 🟢 Arrays & Strings
- Two Sum Variations
- Subarray Problems
- String Manipulation
- Sliding Window
- Prefix Sum

</td>
<td width="33%">

### 🔵 Data Structures
- Linked Lists
- Stacks & Queues
- Trees & Graphs
- Heaps & Priority Queues
- Hash Tables

</td>
<td width="33%">

### 🟣 Algorithms
- Dynamic Programming
- Binary Search
- Backtracking
- Graph Traversal (BFS/DFS)
- Greedy Algorithms

</td>
</tr>
</table>

### Problem Difficulty Distribution

```
Easy     ████████████████░░░░░░░░  60%
Medium   ██████████████████░░░░░░  35%
Hard     ███████░░░░░░░░░░░░░░░░░   5%
```

---

## 📈 Repository Statistics

<div align="center">

![GitHub Repo Size](https://img.shields.io/github/repo-size/Devatva24/Leetcode?style=flat-square&logo=github)
![GitHub Issues](https://img.shields.io/github/issues/Devatva24/Leetcode?style=flat-square&logo=github)
![GitHub Pull Requests](https://img.shields.io/github/issues-pr/Devatva24/Leetcode?style=flat-square&logo=github)
![Contributors](https://img.shields.io/github/contributors/Devatva24/Leetcode?style=flat-square&logo=github)

</div>

### Recent Activity
- 🔥 **742+ commits** demonstrating consistent practice
- 📚 **200+ problems** solved and documented
- 🎯 Regular updates with new solutions

---

## 📂 Repository Structure

```
Leetcode/
│
├── 1-two-sum/                          # Problem #1: Two Sum
│   └── Solution.java                   # Java solution with comments
│
├── 15-3sum/                            # Problem #15: 3Sum
│   └── Solution.java
│
├── 101-symmetric-tree/                 # Problem #101: Symmetric Tree
│   └── Solution.java
│
├── 121-best-time-to-buy-and-sell-stock/
│   └── Solution.java
│
├── 200-number-of-islands/              # Problem #200: Number of Islands
│   └── Solution.java
│
├── 322-coin-change/                    # Problem #322: Coin Change
│   └── Solution.java
│
└── README.md                           # This file
```

### 📁 Folder Organization

Each problem is organized in its own directory following LeetCode's naming convention:
```
[problem-number]-[problem-name]/
└── Solution.java
```

---

## 🚀 How to Use

### Prerequisites

![Java](https://img.shields.io/badge/Java-8+-orange?style=flat-square&logo=java&logoColor=white)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20%7C%20Eclipse%20%7C%20VSCode-blue?style=flat-square)

### Clone the Repository

```bash
git clone https://github.com/Devatva24/Leetcode.git
cd Leetcode
```

### Running a Solution

#### Option 1: Using Command Line
```bash
# Navigate to a specific problem
cd 1-two-sum

# Compile the Java file
javac Solution.java

# Run the solution
java Solution
```

#### Option 2: Using an IDE
1. Open the repository in your preferred IDE (IntelliJ IDEA, Eclipse, VS Code)
2. Navigate to the problem you want to explore
3. Open the `Solution.java` file
4. Run or debug the solution directly from the IDE

#### Option 3: LeetCode Platform
1. Copy the solution code from the `Solution.java` file
2. Paste it into the LeetCode editor for that problem
3. Submit and test against LeetCode's test cases

---

## 📝 Problem Naming Convention

Problems are named using LeetCode's standard format:

```
[problem-number]-[problem-name-in-kebab-case]/
```

**Examples:**
- `1-two-sum/`
- `121-best-time-to-buy-and-sell-stock/`
- `200-number-of-islands/`
- `322-coin-change/`

This makes it easy to:
- 🔍 Search for specific problems
- 📋 Map solutions to LeetCode problems
- 🔗 Share direct problem links

---

## 💡 Solution Template

Each solution follows a consistent structure:

```java
/**
 * Problem: [Problem Name]
 * Difficulty: [Easy/Medium/Hard]
 * Link: https://leetcode.com/problems/problem-name/
 * 
 * Approach: [Brief description of the algorithm/approach used]
 * 
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 */

class Solution {
    public returnType functionName(parameters) {
        // Step 1: [Explanation]
        
        // Step 2: [Explanation]
        
        // Step 3: [Explanation]
        
        return result;
    }
}
```

### Example Solution Structure

```java
/**
 * Problem: Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 * 
 * Approach: Using HashMap to store complements
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Store current number and index
            map.put(nums[i], i);
        }
        
        return new int[] {}; // No solution found
    }
}
```

---

## ✨ Key Features

<table>
<tr>
<td width="50%">

### 🎯 Code Quality
- Clean and readable code
- Proper variable naming
- Consistent formatting
- Self-documenting code

</td>
<td width="50%">

### 📚 Documentation
- Detailed comments
- Complexity analysis
- Approach explanation
- Edge cases covered

</td>
</tr>
<tr>
<td width="50%">

### ⚡ Optimization
- Time-efficient solutions
- Space-efficient implementations
- Multiple approaches when applicable
- Best practices followed

</td>
<td width="50%">

### 🧪 Testing
- Test case handling
- Edge case coverage
- Input validation
- Error handling

</td>
</tr>
</table>

---

## 📚 Topics Covered

<div align="center">

### Core Data Structures
![Arrays](https://img.shields.io/badge/Arrays-✓-success?style=for-the-badge)
![Strings](https://img.shields.io/badge/Strings-✓-success?style=for-the-badge)
![LinkedList](https://img.shields.io/badge/Linked%20Lists-✓-success?style=for-the-badge)
![Stacks](https://img.shields.io/badge/Stacks-✓-success?style=for-the-badge)
![Queues](https://img.shields.io/badge/Queues-✓-success?style=for-the-badge)

### Advanced Data Structures
![Trees](https://img.shields.io/badge/Trees-✓-blue?style=for-the-badge)
![Graphs](https://img.shields.io/badge/Graphs-✓-blue?style=for-the-badge)
![Heaps](https://img.shields.io/badge/Heaps-✓-blue?style=for-the-badge)
![HashMaps](https://img.shields.io/badge/Hash%20Maps-✓-blue?style=for-the-badge)
![Tries](https://img.shields.io/badge/Tries-✓-blue?style=for-the-badge)

### Algorithms
![DP](https://img.shields.io/badge/Dynamic%20Programming-✓-orange?style=for-the-badge)
![BinarySearch](https://img.shields.io/badge/Binary%20Search-✓-orange?style=for-the-badge)
![Sorting](https://img.shields.io/badge/Sorting-✓-orange?style=for-the-badge)
![Greedy](https://img.shields.io/badge/Greedy-✓-orange?style=for-the-badge)
![Backtracking](https://img.shields.io/badge/Backtracking-✓-orange?style=for-the-badge)

### Techniques
![TwoPointers](https://img.shields.io/badge/Two%20Pointers-✓-purple?style=for-the-badge)
![SlidingWindow](https://img.shields.io/badge/Sliding%20Window-✓-purple?style=for-the-badge)
![DFS](https://img.shields.io/badge/DFS-✓-purple?style=for-the-badge)
![BFS](https://img.shields.io/badge/BFS-✓-purple?style=for-the-badge)
![PrefixSum](https://img.shields.io/badge/Prefix%20Sum-✓-purple?style=for-the-badge)

</div>

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

### Adding a New Solution

1. **Fork the repository**
```bash
git clone https://github.com/Devatva24/Leetcode.git
cd Leetcode
```

2. **Create a new branch**
```bash
git checkout -b add-problem-[number]
```

3. **Add your solution**
```bash
# Create directory for the problem
mkdir [problem-number]-[problem-name]

# Add your Solution.java file
# Follow the solution template provided above
```

4. **Commit your changes**
```bash
git add .
git commit -m "Add solution for problem [number]: [name]"
```

5. **Push and create a Pull Request**
```bash
git push origin add-problem-[number]
```

### Improving Existing Solutions

- 🐛 Fix bugs or edge cases
- ⚡ Optimize time/space complexity
- 📝 Improve documentation
- ✨ Add alternative approaches

### Guidelines

- ✅ Follow the existing code style
- ✅ Include complexity analysis
- ✅ Add comments for clarity
- ✅ Test your solution on LeetCode
- ✅ Update README if needed

---

## 📞 Connect

<div align="center">

### Let's Connect and Grow Together! 🚀

[![GitHub](https://img.shields.io/badge/GitHub-@Devatva24-181717?style=for-the-badge&logo=github)](https://github.com/Devatva24)
[![LeetCode](https://img.shields.io/badge/LeetCode-Profile-FFA116?style=for-the-badge&logo=leetcode)](https://leetcode.com/your-username)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0077B5?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/yourprofile)
[![Twitter](https://img.shields.io/badge/Twitter-Follow-1DA1F2?style=for-the-badge&logo=twitter)](https://twitter.com/yourhandle)
[![Email](https://img.shields.io/badge/Email-Contact-D14836?style=for-the-badge&logo=gmail)](mailto:your.email@example.com)

</div>

---

## 📊 Progress Tracker

Track your progress alongside mine:

```
┌─────────────────────────────────────────────────────────┐
│                   Problem Categories                    │
├─────────────────────────────────────────────────────────┤
│ Arrays & Strings         ████████████████░░  80%        │
│ Dynamic Programming      ████████████░░░░░░  60%        │
│ Trees & Graphs          ███████████████░░░░  75%        │
│ Linked Lists            ██████████████████░  90%        │
│ Binary Search           ████████████░░░░░░░  65%        │
│ Stacks & Queues         ███████████████████  95%        │
│ Backtracking            ███████░░░░░░░░░░░░  40%        │
│ Heaps & Priority Queues ██████████░░░░░░░░░  55%        │
└─────────────────────────────────────────────────────────┘
```

---

## 🎓 Interview Preparation Resources

### Recommended Study Path

1. **Start with Easy Problems**
   - Build strong fundamentals
   - Master basic data structures
   - Understand common patterns

2. **Progress to Medium Problems**
   - Apply multiple concepts
   - Optimize solutions
   - Learn advanced techniques

3. **Challenge with Hard Problems**
   - Complex problem-solving
   - Multiple approach analysis
   - Time-constraint practice

### Study Tips

💡 **Consistency is Key** - Solve at least one problem daily  
💡 **Understand, Don't Memorize** - Focus on the approach  
💡 **Time Yourself** - Practice under interview conditions  
💡 **Review Solutions** - Learn from different approaches  
💡 **Document Your Learning** - Take notes on patterns  

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

```
MIT License

Copyright (c) 2024 Devatva24

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

## 🙏 Acknowledgments

- Thanks to [LeetCode](https://leetcode.com/) for providing an excellent platform for coding practice
- Inspired by the competitive programming community
- Special thanks to all contributors who help improve this repository

---

## ⭐ Show Your Support

If you find this repository helpful, please consider:

- ⭐ **Starring** the repository
- 🍴 **Forking** to create your own solutions
- 📢 **Sharing** with others preparing for interviews
- 🐛 **Reporting** issues or bugs
- 💡 **Suggesting** improvements

---

<div align="center">

### 💪 Keep Coding, Keep Learning!

![Footer](https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=150&section=footer&text=Happy%20Coding!%20🚀&fontSize=50&fontColor=fff&animation=fadeIn)

**"The only way to learn a new programming language is by writing programs in it." - Dennis Ritchie**

</div>
