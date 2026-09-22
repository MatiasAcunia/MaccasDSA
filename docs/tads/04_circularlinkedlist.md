# 04 — CircularLinkedList

## Scope

Lista simplemente circular; doble circular como ampliación.

## Operations

addFirst; addLast; removeFirst; removeLast; get; size.

## Invariants

si no vacía tail.next=head; no esperar un terminador NULL.

## Verification

vacía; uno; vuelta completa; borrado del último nodo.

## Complexity

extremos O(1) con tail salvo detalles de removeLast en singly O(n).
