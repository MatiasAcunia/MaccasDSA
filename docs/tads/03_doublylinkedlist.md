# 03 — DoublyLinkedList

## Scope

Enlaces prev y next.

## Operations

addFirst; addLast; removeFirst; removeLast; insert; removeAt; get; size.

## Invariants

head.prev=null; tail.next=null; next.prev/prev.next recíprocos.

## Verification

transiciones vacío-uno-dos; recorre ida/vuelta; borrar interior.

## Complexity

extremos O(1); acceso por índice O(n).
