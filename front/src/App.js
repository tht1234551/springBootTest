import './App.css';
import MyComponent from "./MyComponent";
import PropTypes from "prop-types";
import Counter from "./Counter";

// function App() {
//     const name = "리액트";
//   return (
//       <>
//         <h1>{name} 안녕</h1>
//       </>
//   );
// }

const App = () => {
    return (
        <>
            <MyComponent name={3}>칠드런</MyComponent>
            <Counter/>
        </>
    )
};

MyComponent.defaultProps = {
    name : '기본이름'
};

MyComponent.propTypes = {
    name : PropTypes.string,
    number : PropTypes.number.isRequired
};

export default App;
