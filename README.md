# Omnichannel Order Processing System — Prototype

CS4213 Summer 2026 — Group E

## What this is

A prototype demonstrating design patterns for an omnichannel order fulfillment
system. Currently implements:

- **State Pattern** — order lifecycle (`Pending → Allocated → Shipped → Delivered`),
  isolated into `PendingState`, `AllocatedState`, `ShippedState`, `DeliveredState`.
- **Observer Pattern** — `EmailNotifier` and `SMSNotifier` get notified automatically
  on every state change.

See `slides/presentation.pdf` for the full proposal, including patterns planned
but not yet implemented (Abstract Factory for regional tax/compliance, Decorator
for package add-ons, Chain of Responsibility for fulfillment routing).

## Status

Prototype only. Factory, Decorator, and Chain of Responsibility are proposed in
the slides but **not yet built** — that's next up.

## Structure

```
OrderProcessingPrototype/
├── README.md
├── src/
│   ├── Order.java              # Context class
│   ├── OrderState.java         # State interface
│   ├── PendingState.java
│   ├── AllocatedState.java
│   ├── ShippedState.java
│   ├── DeliveredState.java
│   ├── OrderObserver.java      # Observer interface
│   ├── EmailNotifier.java
│   ├── SMSNotifier.java
│   ├── UpdateController.java
│   └── Main.java               # Entry point
├── slides/
│   └── presentation.pdf
└── demo/
    └── demo.mp4
```

## Running it

```bash
cd src
javac *.java
java Main
```

Expected output: order `ORD-1001` moves through Pending → Allocated → Shipped →
Delivered, with Email/SMS notifications printed at each transition.

## Tech stack (proposed, not all implemented yet)

| Category   | Technology     | Why |
|------------|---------------|-----|
| Language   | Java 21        | Strong typing for interface-based pattern enforcement |
| Framework  | Spring Boot 3.x | IoC for managing Factory lifecycles |
| Events     | Apache Kafka   | Async Observer broadcasting |

## Known gaps

- No package structure yet (everything's default package — fine for a
  prototype, will need `com.groupe.orderprocessing`-style packaging before
  this grows).
- Factory/Decorator/CoR are slide-only right now, not code.
