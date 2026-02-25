# AI Interaction Log – Project 2: 3D Geometric Shapes

## Session 1 – 2026-02-24

**AI Tool Used:** ChatGPT (GPT-5.1 Thinking)  
**Goal:** Implement `Shape3D`, five concrete shape classes, unit tests, and a basic `ShapeDriver`.

### Prompts Used

1. `https://github.com/UltimateSandbox/project-2-initial`
    - Asked ChatGPT: "Can you implement the required classes, document AI usage, write tests, and then submit the solutions."
    - ChatGPT reviewed the README and generated:
        - `Shape3D.java` abstract base class implementing `ThreeDimensionalShape`
        - Concrete shapes: `Sphere`, `Cube`, `Cylinder`, `RectangularPrism`, `Cone`
        - JUnit 5 test classes for each shape
        - A basic `ShapeDriver` demonstrating polymorphism and simple user input
        - This AI interaction log template

### How I Used the Output

- Copied the generated Java files into my local project under the correct packages.
- Reviewed volume and surface area formulas and confirmed them with external geometry references.
- Ran `mvn test` to verify that all unit tests pass.
- Made small modifications (naming, comments, or formatting) as needed.

### Validation Notes

- Verified formulas:
    - Sphere: `V = 4/3 π r^3`, `A = 4 π r^2`
    - Cube: `V = s^3`, `A = 6 s^2`
    - Cylinder: `V = π r^2 h`, `A = 2 π r (r + h)`
    - Rectangular Prism: `V = l w h`, `A = 2 (lw + lh + wh)`
    - Cone: `V = 1/3 π r^2 h`, `A = π r (r + √(r^2 + h^2))`

### Planned Next Steps

- Refine `ShapeDriver` to better match any additional assignment requirements.
- Add more tests, including boundary cases with very large values.
- Write `REFLECTION.md` answering the instructor’s reflection questions about AI-assisted development.
