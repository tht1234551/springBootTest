import './App.css';
import MyComponent from "./MyComponent";
import PropTypes from "prop-types";
import Counter from "./Counter";
import {Route, Link} from 'react-router-dom';

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
            <ul>
                <li><Link to="/">홈</Link></li>
            </ul>
            <ul>
                <li><Link to="/MyComponent">MyComponent</Link></li>
            </ul>
            <ul>
                <li><Link to="/Counter">Counter</Link></li>
            </ul>

            <Route path="/MyComponent" component={MyComponent}/>
            <Route path="/Counter" component={Counter}/>
        </>
    )
}

MyComponent.defaultProps = {
    name : '기본이름'
}

MyComponent.propTypes = {
    name : PropTypes.string,
    // number : PropTypes.number.isRequired
}

export default App;
