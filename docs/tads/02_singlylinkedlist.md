# 02 — SinglyLinkedList

## Scope

Nodos y enlace next.

## Operations

addFirst; addLast; get; insert; removeFirst; removeAt; size.

## Invariants

head/tail coherentes; tail.next=null; no ciclos.

## Verification

vacía; singleton; enlaces tras varias eliminaciones.

## Complexity

addFirst O(1); addLast O(1) con tail; get/removeAt O(n).
