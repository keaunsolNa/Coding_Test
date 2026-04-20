---
id: 1192
internal_id: 1300
slug: critical-connections-in-a-network
title: Critical Connections in a Network
difficulty: Hard
tags: Depth-First Search, Graph Theory, Biconnected Component
date: 2026-04-20
lang: java
---

# 1192. Critical Connections in a Network

**Difficulty:** Hard | **Tags:** Depth-First Search, Graph Theory, Biconnected Component

## Description

There are `n` servers numbered from `0` to `n - 1` connected by undirected server-to-server `connections` forming a network where `connections[i] = [ai, bi]` represents a connection between servers `ai` and `bi`. Any server can reach other servers directly or indirectly through the network.

 A _critical connection_ is a connection that, if removed, will make some servers unable to reach some other server.

 Return all critical connections in the network in any order.

 

 **Example 1:**

  ```
Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
Explanation: [[3,1]] is also accepted.
```

 **Example 2:**

 ```
Input: n = 2, connections = [[0,1]]
Output: [[0,1]]
```

 

 **Constraints:**

 - `2 <= n <= 105`
- `n - 1 <= connections.length <= 105`
- `0 <= ai, bi <= n - 1`
- `ai != bi`
- There are no repeated connections.
