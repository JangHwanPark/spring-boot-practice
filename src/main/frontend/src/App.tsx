import {useState, useEffect} from 'react'
import './App.css'

interface User {
    uid: number;
    name: string;
    address: string;
}

function App() {
    const [data, setData] = useState<User>({
        uid: 0, name: "", address: ""
    });

    useEffect(() => {
        fetch("http://localhost:8081/user")
            .then((res) => res.json())
            .then((data) => setData(data));
    }, []);

    console.log(data)
    return (
        <>
            <div>
                Hello World!
            </div>
            <div>
                <p>{data.uid}</p>
                <p>{data.name}</p>
                <p>{data.address}</p>
            </div>
        </>
    )
}

export default App