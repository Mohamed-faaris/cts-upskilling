# Bootstrap 5 Exercises - Complete Report

## Project Structure

```
bootstrap0/
├── ex1/
│   ├── ex1.1/   # Bootstrap 5 CDN Setup
│   └── ex1.2/   # Bootstrap 5 Local/NPM Setup
├── ex2/
│   ├── ex2.1/   # Bootstrap Directory Structure Exploration
│   └── ex2.2/   # Bootstrap JS Plugins via bundle
├── ex3/
│   ├── ex3.1/   # Responsive Grid - Stack/Mobile/Tablet/Desktop
│   └── ex3.2/   # Container, Row, Col Classes
├── ex4/
│   ├── ex4.1/   # Two-Column Sidebar + Content
│   └── ex4.2/   # Four-Column Equal Width
├── ex5/
│   ├── ex5.1/   # Center Content (justify-content-center, align-items-center)
│   └── ex5.2/   # Reorder Columns (order-md-*)
├── ex6/
│   ├── ex6.1/   # Responsive Flexbox Navbar
│   └── ex6.2/   # Flex Card Layout (justify-content-between)
├── ex7/
│   ├── ex7.1/   # Typography Utilities (display, lead, text-muted, fw-bold)
│   └── ex7.2/   # Text Transform (uppercase, lowercase, capitalize)
├── ex8/
│   ├── ex8.1/   # Registration Form (form-control, input-group, form-check)
│   └── ex8.2/   # Login Form (form-floating)
├── ex9/
│   ├── ex9.1/   # Contextual Buttons (btn-*, btn-outline-*)
│   └── ex9.2/   # Button Groups & Toggle Buttons
├── ex10/
│   ├── ex10.1/  # Responsive Navbar with Search
│   └── ex10.2/  # Tabbed Navigation (nav-tabs, nav-pills)
├── ex11/
│   ├── ex11.1/  # Profile Card (card, card-img-top)
│   └── ex11.2/  # Media Object Layout
├── ex12/
│   ├── ex12.1/  # Margin & Padding Utilities
│   └── ex12.2/  # Pricing Section with Spacing
├── ex13/
│   ├── ex13.1/  # Dashboard Colors (bg-*, text-*)
│   └── ex13.2/  # Gradient Backgrounds (bg-gradient)
├── ex14/
│   ├── ex14.1/  # Display Utilities (d-none, d-md-block, d-lg-flex)
│   └── ex14.2/  # Responsive Sidebar
├── ex15/
│   ├── ex15.1/  # Border Utilities (border, rounded-circle)
│   └── ex15.2/  # Shadows & Rounded Pill
├── ex16/
│   ├── ex16.1/  # Fixed Footer (position-fixed)
│   └── ex16.2/  # Badge Overlay (position-relative, position-absolute)
├── ex17/
│   ├── ex17.1/  # Bootstrap Icons - Social Media Footer
│   └── ex17.2/  # Bootstrap Icons - Icon-Only Buttons
├── ex18/
│   ├── ex18.1/  # Modal Popup
│   └── ex18.2/  # Accordion
├── ex19/
│   ├── ex19.1/  # Sass Setup with npm
│   └── ex19.2/  # Customize Bootstrap via Sass (_variables.scss)
└── readme.md    # This file
```

## Exercise Completion Summary

### 1. Setting Up Bootstrap 5
- **ex1.1**: Basic HTML page with Bootstrap 5 linked via CDN (`bootstrap.min.css` + `bootstrap.bundle.min.js`)
- **ex1.2**: npm project initialized (`npm init -y`, `npm install bootstrap@5`), HTML links to local `node_modules/bootstrap/dist/` files

### 2. Bootstrap Structure and Files
- **ex2.1**: Cards explaining `css/` (precompiled styles), `js/` (Bootstrap + Popper JS bundles), and `icons/` (2000+ SVG icons)
- **ex2.2**: HTML with modal (requires JS) linked via `bootstrap.bundle.min.js` CDN

### 3. Fundamentals of Responsive Grid Layout
- **ex3.1**: `col-12 col-md-6 col-lg-4` — stacks mobile, 2-wide tablet, 3-wide desktop
- **ex3.2**: Container > Row > Col with `col-sm-4` (3 cols) and `col-6` (2 cols)

### 4. Column Layouts and Grid Classes
- **ex4.1**: Sidebar (`col-md-3`) + Content (`col-md-9`)
- **ex4.2**: Four equal columns (`col-sm-3`)

### 5. Alignment and Reordering in Grid
- **ex5.1**: `justify-content-center` + `align-items-center` to center content vertically + horizontally
- **ex5.2**: `order-md-1`, `order-md-2`, `order-md-3` to reorder columns at md breakpoint

### 6. Responsive Flexbox Utilities
- **ex6.1**: `d-flex flex-column flex-md-row` navbar — vertical on mobile, horizontal on desktop
- **ex6.2**: `d-flex justify-content-between align-items-center flex-wrap` card layout

### 7. Typography
- **ex7.1**: `display-1`, `display-3`, `lead`, `text-muted`, `fw-bold`, `fst-italic`, `text-primary`, etc.
- **ex7.2**: `text-uppercase`, `text-lowercase`, `text-capitalize`

### 8. Forms
- **ex8.1**: Registration form with `form-control`, `input-group`, `form-select`, `form-check`
- **ex8.2**: Login form with `form-floating` (floating labels), `form-check`

### 9. Buttons
- **ex9.1**: All contextual button classes (`btn-primary`, `btn-outline-*`, `btn-lg`, `btn-sm`)
- **ex9.2**: `btn-group`, `btn-toolbar`, checkbox toggle buttons with `btn-check`

### 10. Navbars and Navigation
- **ex10.1**: Fully responsive navbar with brand, collapsible nav links, and search form
- **ex10.2**: `nav-tabs`, `nav-pills`, and interactive pill tabs with `data-bs-toggle="pill"`

### 11. Cards and Media Objects
- **ex11.1**: Profile card with `card-img-top`, `card-body`, `card-title`
- **ex11.2**: Media object using `d-flex` + `me-3` with nested media example

### 12. Spacing Utilities
- **ex12.1**: `m-3`, `mt-4`, `p-2`, `py-5`, `px-4`, `ms-5`, `mb-5`
- **ex12.2**: Pricing section with `py-5`, `mb-5`, `g-4`, `py-2`, `mb-3`, `mb-4`

### 13. Colors and Backgrounds
- **ex13.1**: Dashboard with `bg-primary`, `bg-success`, `bg-warning`, `bg-danger`, `bg-info`, `bg-dark` and text colors
- **ex13.2**: `bg-gradient` with `bg-dark`, `bg-primary`, `bg-success`, `bg-warning`

### 14. Display and Visibility
- **ex14.1**: `d-none`, `d-md-block`, `d-lg-flex`, `d-block d-md-none`
- **ex14.2**: Sidebar with `d-none d-md-block` — visible only on tablets+

### 15. Borders, Shadows, and Rounded Corners
- **ex15.1**: `border`, `border-primary`, `border-3`, `rounded-circle`, `border-start`, `rounded-0` through `rounded-pill`
- **ex15.2**: `shadow-sm`, `shadow`, `shadow-lg` with `rounded-pill` on cards

### 16. Positioning Utilities
- **ex16.1**: `position-fixed bottom-0 start-0 w-100` fixed footer
- **ex16.2**: `position-relative` container + `position-absolute` badges overlaid on an image

### 17. Icons with Bootstrap Icons
- **ex17.1**: Footer with `bi-twitter-x`, `bi-facebook`, `bi-instagram`, `bi-linkedin`, `bi-github`, `bi-envelope-fill`
- **ex17.2**: Icon buttons (`bi-plus-circle`, `bi-pencil`, `bi-trash`, `bi-search`, `bi-download`, `bi-gear`) and icon-only buttons (text hidden)

### 18. Bootstrap 5 JavaScript Plugins
- **ex18.1**: Modal triggered by button with `data-bs-toggle="modal"`, `data-bs-target`
- **ex18.2**: Accordion with `accordion`, `data-bs-toggle="collapse"`, `data-bs-parent`

### 19. Customization with Sass
- **ex19.1**: Sass project with `npm install bootstrap sass`, SCSS imports, build/watch scripts (`npm run build`)
- **ex19.2**: Custom `$primary: #6f42c1`, `$border-radius: 0.5rem`, `$enable-shadows: true` via `_variables.scss` override

## Run Instructions

- **Open any HTML file**: Simply open in browser (most exercises use CDN)
- **ex1.2 (local npm)**: If files don't load, run `npm install` in `ex1/ex1.2/`
- **ex19 Sass projects**: Run `npm run build` in `ex19/ex19.1/` or `ex19/ex19.2/` to recompile CSS after SCSS changes, or `npm run watch` for auto-recompile
