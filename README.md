<<<<<<< HEAD
# Smart Home Devices Assignment (Abstract Factory & Factory Method)

## Repository Structure

- `src/` — Source code for the smart device factories and products
  - `devices/` — All Java classes for device interfaces, concrete devices, factories, and usage reader
- `data/usage.csv` — CSV file with usage values for each brand/device
- `tests/` — Test drivers to demonstrate and verify the design

## Design Patterns Used

- **Abstract Factory Pattern:**
  - `DeviceFactory` (abstract class) defines creation of product families (Bulb, Lock)
  - `BrandAFactory` and `BrandBFactory` create brand-specific devices
- **Factory Method Pattern:**
  - Each factory uses `makeBulb` and `makeLock` to defer instantiation to subclasses
  - Usage values are set after creation using `UsageReader`

## Test Methods

- `TestDriver.java`: Demonstrates creation and usage of Brand A devices (bulb and lock)
- `TestDevices.java`: Demonstrates creation and usage of both Brand A and Brand B devices, including:
  - Bulb from Brand A
  - Lock from Brand B
  - Also prints usage for Brand B Bulb and Brand A Lock

## Example Output

```
=== Test: Bulb from Brand A ===
BrandABulb turned on.
Brand A Bulb power usage: [value from usage.csv] W
BrandABulb turned off.

=== Test: Lock from Brand B ===
BrandBLock locked.
Brand B Lock battery consumption: [value from usage.csv] %/month
BrandBLock unlocked.

=== Also show Brand B Bulb and Brand A Lock ===
Brand B Bulb usage: [value from usage.csv] W
Brand A Lock battery consumption: [value from usage.csv] %/month
```

Replace `[value from usage.csv]` with the actual values from your `data/usage.csv` file.

## How to Run

1. Compile all Java files in `src/devices/` and `tests/`.
2. Run `TestDevices` or `TestDriver` from the `tests` folder.

## Screenshots

Paste screenshots of your test output here after running the test drivers.
=======

>>>>>>> c0e50fdab35dc69bc34158b278cdbf484e5f1377
