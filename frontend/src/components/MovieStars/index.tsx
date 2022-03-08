import {ReactComponent as FullStar} from 'assets/img/full_star.svg'
import {ReactComponent as HalfStar} from 'assets/img/half_star.svg'
import {ReactComponent as EmptyStar} from 'assets/img/empty_star.svg'
import './styles.css';

function MovieStars(){
    return(<div className="dsmovie-stars-container">
    <FullStar />
    <FullStar />
    <FullStar />
    <HalfStar />
    <EmptyStar />
  </div>
  );
}

export default MovieStars;